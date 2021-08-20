package com.ocanha.customviewscomkotlin.components

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.ocanha.customviewscomkotlin.R
import com.ocanha.customviewscomkotlin.databinding.ResProfileImageBinding

class ProfileImage(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    private var visualized : Boolean = false

    private val binding: ResProfileImageBinding = ResProfileImageBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    init {

        context.obtainStyledAttributes(attrs, R.styleable.ProfileImage).apply {
            setImageProfile(getResourceId(R.styleable.ProfileImage_src, R.drawable.default_profile))
            setVisualized(getBoolean(R.styleable.ProfileImage_visualized, visualized))
        }

    }

    fun setVisualized(isVisualized: Boolean) {
        this.visualized = isVisualized
        if (!this.visualized) {
            this.binding.cvProfileImage.setCardBackgroundColor(Color.parseColor("#c6c6c6"))
        } else {
            this.binding.cvProfileImage.setCardBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.instagram_color
                )
            )
        }
    }

    fun isVisualized() : Boolean {
         return visualized
    }

    fun setImageProfile(resourceId: Int) {
        this.binding.imgProfileImage.setImageResource(resourceId)
    }

}