package io.github.asvid.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.asvid.firstlib.FirstLibObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirstLibObject.someMethd()
    }
}
