package com.example.imagegallery.view;

import android.os.Bundle;

import com.example.imagegallery.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviderKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.imagegallery.adapters.ImageListAdapter;
import com.example.imagegallery.databinding.FragmentImageListBinding;
import com.example.imagegallery.model.pojos.Image;
import com.example.imagegallery.viewmodel.ImageViewModel;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageListFragment extends Fragment {

    private FragmentImageListBinding binding;
    private RecyclerView rvImageList;
    private ImageListAdapter imageListAdapter;

    public ImageListFragment() {
        // Required empty public constructor
    }

    public static ImageListFragment newInstance() {
        ImageListFragment fragment = new ImageListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentImageListBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvImageList = binding.rvImageList;
        imageListAdapter = new ImageListAdapter(getActivity());

        rvImageList.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvImageList.setAdapter(imageListAdapter);

        ImageViewModel imageViewModel = new ViewModelProvider(getActivity()).get(ImageViewModel.class);
        imageViewModel.getImagesData().observe(getActivity(), imageList -> {
            imageListAdapter.setImageList(imageList);
        });
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        MenuInflater menuInflater = getActivity().getMenuInflater();
        menuInflater.inflate(R.menu.list_screen_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.miToggleView:
                toggleRVLayout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void toggleRVLayout() {
        RecyclerView.LayoutManager currLayout = rvImageList.getLayoutManager();
//        Log.d("toggle", "toggleRVLayout: " + currLayout);
        if(currLayout instanceof LinearLayoutManager) {
//            Log.d("toggle", "toggleRVLayout: true");
            rvImageList.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        } else {
            rvImageList.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
    }
}