package com.dicoding.umarelvaruq.suikov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvStars: RecyclerView
    private var list: ArrayList<Star> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvStars = findViewById(R.id.rv_stars)
        rvStars.setHasFixedSize(true)

        list.addAll(StarsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvStars.layoutManager = LinearLayoutManager(this)
        val listStarAdapter = ListStarAdapter(list)
        rvStars.adapter = listStarAdapter

        listStarAdapter.setOnItemClickCallback(object : ListStarAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Star) {
                showSelectedStar(data)
            }
        })
    }
    private fun showSelectedStar(star: Star) {
        val intent = Intent(this@MainActivity, DetailStar::class.java)
        intent.putExtra(DetailStar.EXTRA_NAME, star.name)
        intent.putExtra(DetailStar.EXTRA_RECRUIT, star.recruit)
        intent.putExtra(DetailStar.EXTRA_IMAGE, star.photo)
        startActivity(intent);
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
            R.id.about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent);
            }
        }
    }
}
