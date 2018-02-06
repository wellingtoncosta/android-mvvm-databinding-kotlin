package br.com.wellingtoncosta.amdk.mock

import br.com.wellingtoncosta.amdk.domain.model.Color
import br.com.wellingtoncosta.amdk.domain.model.User
import java.util.ArrayList

/**
 * @author wellingtoncosta on 05/02/18.
 */
object Mocks {

    fun createUsers(): List<User> {
        val users = ArrayList<User>()

        users.add(User(1, "Foo", "Bar", null))
        users.add(User(2, "Baa", "For", null))
        users.add(User(3, "Boo", "Far", null))

        return users
    }

    fun createColors(): List<Color> {
        val colors = ArrayList<Color>()

        colors.add(Color(1, "Red", 2000, "#FF0000"))
        colors.add(Color(2, "Green", 2001, "#00FF00"))
        colors.add(Color(3, "Blue", 2002, "#0000FF"))

        return colors
    }

}