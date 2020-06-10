package com.example.smth.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smth.R
import com.example.smth.retrofit.ServiceBuilder
import com.example.smth.retrofit.TmdbEndpoints
import com.example.smth.retrofit.api_key
import kotlinx.android.synthetic.main.home_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() , MovieAdapter.OnItemClickListener{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.home_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val request = ServiceBuilder.buildService(TmdbEndpoints::class.java)
        val call = request.getMovies(api_key)

        call.enqueue(object : Callback<PopularMovies>{
            override fun onResponse(call: Call<PopularMovies>, response: Response<PopularMovies>) {
                if (response.isSuccessful){
                    rv_movie.apply {
                        setHasFixedSize(true)
                        layoutManager = LinearLayoutManager(context)
                        adapter = MovieAdapter(response.body()!!.results,this@HomeFragment)

                    }
                }
            }
            override fun onFailure(call: Call<PopularMovies>, t: Throwable) {
                Toast.makeText(context, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onItemClicked(movie: Result) {
        var action = HomeFragmentDirections.actionHomeToSingleItem(movie)
        val navController =  Navigation.findNavController(requireView())
        navController.navigate(action)

        }

    override fun onFavouriteClick() {
        TODO("Not yet implemented")
    }


}