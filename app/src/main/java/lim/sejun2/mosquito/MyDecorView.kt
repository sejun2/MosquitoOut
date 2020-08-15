package lim.sejun2.mosquito

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.fragment.app.Fragment


class MyDecorView : Fragment() {
    companion object{
        val TAG = "MyDecorView"
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d(TAG, "onOptionsItemSelected!")
        when(item.itemId){
            R.id.app_info -> {
                Log.d(TAG, "app_info clicked")}
            R.id.contact -> {Log.d(TAG, "contact clicked")}
            R.id.evaluate -> {Log.d(TAG, "evaluate clicked")}
        }
        return true
    }
}