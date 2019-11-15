package com.donggeon.honmaker.ui.food;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.donggeon.honmaker.databinding.ItemFoodBinding;

public class FoodItemViewHolder extends RecyclerView.ViewHolder {

    private ItemFoodBinding binding;

    FoodItemViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }

    void bindTo(@NonNull final Food item) {
        binding.setItem(item);
    }
}