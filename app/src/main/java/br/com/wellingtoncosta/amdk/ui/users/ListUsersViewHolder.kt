package br.com.wellingtoncosta.amdk.ui.users

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import br.com.wellingtoncosta.amdk.databinding.ListUsersItemBinding

/**
 * @author Wellington Costa on 31/12/2017.
 */
class ListUsersViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding: ListUsersItemBinding? = DataBindingUtil.bind(view)

}