package `4 Classes`

interface HomeFragmentPresenter {
    fun navigate()
}

class HomeFragment {
    //const val TAG="HomeFragment"
    var color = "Red"

    companion object:HomeFragmentPresenter {
        const val TAG = "HomeFragment"
        private var homeFragment: HomeFragment? = null
        fun newInstance(): HomeFragment {
            homeFragment = HomeFragment()
            return homeFragment as HomeFragment
        }

        override fun navigate() {
            TODO("Not yet implemented")
        }

    }
}

fun main() {
    val homeFragment = HomeFragment.newInstance()
    homeFragment.color = "Blue"
    val homeFragment2 = HomeFragment.newInstance()
    homeFragment2.color = "Yellow"
    val homeFragment3 = HomeFragment.newInstance()
    val homeFragment4 = HomeFragment.newInstance()
    homeFragment4.color = "Cyan"
    val homeFragment5 = HomeFragment.newInstance()
    homeFragment5.color = "Magenta"

    println("homefragment color : ${homeFragment.color}")
    println("homefragment2 color : ${homeFragment2.color}")
    println("homefragment3 color : ${homeFragment3.color}")
    println("homefragment4 color : ${homeFragment4.color}")
    println("homefragment5 color : ${homeFragment5.color}")
}