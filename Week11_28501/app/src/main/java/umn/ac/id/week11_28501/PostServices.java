package umn.ac.id.week11_28501;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostServices {

    @GET("posts")
    Call<ArrayList<PostModel>> getPost();
}