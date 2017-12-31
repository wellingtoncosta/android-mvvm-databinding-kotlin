package br.com.wellingtoncosta.amdk.ui.colors

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import br.com.wellingtoncosta.amdk.databinding.ListColorsItemBinding

/**
 * @author Wellington Costa on 31/12/2017.
 */
class ListColorsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding: ListColorsItemBinding = DataBindingUtil.bind(view)

}