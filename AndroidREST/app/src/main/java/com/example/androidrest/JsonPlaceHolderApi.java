package com.example.androidrest;
import java.util.List;
import retrofit2.Call;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();
}
