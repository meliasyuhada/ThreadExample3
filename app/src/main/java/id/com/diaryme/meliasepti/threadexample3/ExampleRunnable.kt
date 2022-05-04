package id.com.diaryme.meliasepti.threadexample3

import android.util.Log

class ExampleRunnable : Runnable {
    var second = 0
    val TAG = "MainActivvity"

    constructor(second : Int) {
        this.second = second
    }

    override fun run() {
        for (i in 1 until second) {
            Log.d(TAG, "startThread: $i")
            try {
                Thread.sleep(1000)
            } catch (ie: InterruptedException) {
                ie.printStackTrace()
            }
        }
    }
}