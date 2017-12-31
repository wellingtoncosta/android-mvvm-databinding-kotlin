package br.com.wellingtoncosta.amdk.ui.colors

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import br.com.wellingtoncosta.amdk.domain.model.Color

/**
 * @author  Wellington Costa on 31/12/2017.
 */
object ListColorsBindings {

    @JvmStatic
    @BindingAdapter("load_colors")
    fun loadColors(recyclerView: RecyclerView, colors: List<Color>?) {
        recyclerView.adapter = if (colors != null) ListColorsAdapter(colors) else ListColorsAdapter(emptyList())
    }

    @JvmStatic
    @BindingAdapter("load_color_value")
    fun loadColorValue(imageView: ImageView, color: Color?) {
        imageView.setBackgroundColor(android.graphics.Color.parseColor(color?.color))
    }

}