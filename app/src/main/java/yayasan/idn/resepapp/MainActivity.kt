package yayasan.idn.resepapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvResep: RecyclerView
    private var list: ArrayList<Resep> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"

        rvResep = findViewById(R.id.rvResep)
        rvResep.setHasFixedSize(true)
        list.addAll(ResepData.listData)
        showRecyclerList()

    }
    private fun showRecyclerList() {
        rvResep.layoutManager = LinearLayoutManager(this)
        val listResepAdapter = ListResepAdapter(list)
        rvResep.adapter = listResepAdapter

        listResepAdapter.setOnItemClickCallback(object : ListResepAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Resep) {
                showResepSelected(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.Profile -> {
                val intent = Intent(this@MainActivity,Profile::class.java)
                startActivity(intent)
            }
        }
    }


    private fun showResepSelected(resep: Resep) {
        Toast.makeText(this, "Kamu memilih " + resep.name, Toast.LENGTH_SHORT).show()
        val moveData = Intent(this, DetailActivity::class.java)
        moveData.putExtra(DetailActivity.EXTRA_NAME, resep.name)
        moveData.putExtra(DetailActivity.EXTRA_PHOTO, resep.photo)
        moveData.putExtra(DetailActivity.EXTRA_DETAIL, resep.detail)
        startActivity(moveData)
    }
}