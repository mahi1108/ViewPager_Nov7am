package cubex.mahesh.viewpager_nov7am

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MaterialsFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
            container: ViewGroup?, savedInstanceState: Bundle?): View? {
       var v = inflater.inflate(R.layout.materials,container,
               false)

        return v
    }

}