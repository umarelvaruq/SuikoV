package com.dicoding.umarelvaruq.suikov

object StarsData {
    private val starNames = arrayOf("Prince Falenas",
        "Lyon",
        "Sairoh",
        "Boz Wilde",
        "Luserina Barows",
        "Cornelio",
        "Logg",
        "Lun",
        "Cius",
        "Lelei",
        "Lucretia Merces",
        "Raja",
        "Kisara",
        "Takamu",
        "Josephine",
        "Egbert Aethelbald",
        "Shinro",
        "Kyle",
        "Chuck",
        "Norden",
        "Oboro",
        "Fuyo",
        "Shigure",
        "Zegai",
        "Sorensen",
        "Viki",
        "Zerase",
        "Lorelai",
        "Zweig",
        "Muroon",
        "Talgeyl",
        "Goesch",
        "Silva",
        "Toma",
        "Wilhelm")

    private val starRecruit = arrayOf("Joins automatically at the beginning of the story.",
        "Joins automatically at the beginning of the story.",
        "When Salt goes up in price (check prices and/or rumors), talk to Sairoh in Raftfleet and he will ask what you will do to take care of the salt price problem. Sell 6 Salts to a trade shop immediately and talk to him again. To get Salt, buy it (earlier) in trade shops.",
        "Joins automatically at Haud Village after escaping from Lunas.",
        "Joins automatically during the defense of Rainwall.",
        "After the defense of Rainwall, talk to him in Haud Village. Fight all of his DoReMi elves, and he'll join afterwards.",
        "Joins automatically after speaking with Kisara on the Dahak.",
        "Joins automatically after speaking with Kisara on the Dahak.",
        "Joins automatically after Lucretia's rescue from Agate Prison.",
        "Joins automatically after Lucretia's rescue from Agate Prison.",
        "Joins automatically after she is rescued from Agate Prison.",
        "Joins automatically after the defense of Raftfleet.",
        "Joins automatically after the defense of Raftfleet.",
        "After recruiting Lucretia, bring Cius to Agate Prison and meet Takamu. Find his maps in the basement, and let him join afterwards.",
        "Talk to her in Haud Village with Sialeeds or Sharmista in your party. You can also take Shula to her just after he, Sharmista, and Nifsara join.",
        "After the defense of Raftfleet, talk to Egbert in the tunnels underneath Agate Prison. Do not skip any of his dialogues. You can exit the area and come back if you messed up.",
        "After the defense of Raftfleet, talk to him in the Raftfleet item shop.",
        "Joins automatically in Rainwall.",
        "Joins automatically after obtaining the Dawn Rune.",
        "After the relocation from Rainwall to Raftfleet, talk to him in the Raftfleet Inn and allow him to join. Norden will move to Lordlake after its restoration northwest of the town's entrance.",
        "Two ways to recruit:\n" +
                "\n" +
                "1. After initially hiring Oboro in Rainwall, go to the inn and talk to the drunk at the bar. Upon leaving the inn, accompany Shigure and Sagiri for Norden's investigation. When Oboro speaks about employing mice, ask \"That man went inside the house\", and when talking to Norden with Oboro in the Tavern, say \"We need to talk to you about something\". After the relocation of Raftfleet, talk to Oboro and ask him to join in his office in Raftfleet.\n" +
                "\n" +
                "2. If you did not successfully perform the Norden investigation, you may have to ask him to join up to five times as storyline progresses: after Raftfleet; after HQ; after Lelcar; after Sable; and after Beaver Lodge. If you wait until after the Queen's Campaign, his ship will be gone from Raftfleet forever.",
        "Joins with Oboro.",
        "Joins with Oboro.",
        "After relocating to Raftfleet, meet him near Lunas Northern Woods (needs Takamu, Urda, or Isato). Ask him to join. He will likely not join you immediately if you did not stick up for him in the events in the beginning at Stormfist. You can also catch a dialogue with him in the prison of Sol-Falena when you are heading for Lunas with Lymsleia. Some people have reported overcoming this barrier by repeatedly asking him.",
        "After relocating to Raftfleet, go to the Rotation Bridge and talk to the soldier there. Return to Estrise and talk to Babbage again. Sail to the bridge, and go to the top. After dismantling the bridge, leave the place, and return to Estrise. Sorensen will join afterwards if you ask Babbage to join.",
        "Joins automatically after leaving the Ceras Lake Ruins.",
        "Joins automatically after you acquire your headquarters.",
        "Joins automatically in the Ceras Lake Ruins.",
        "Joins automatically in the Ceras Lake Ruins.",
        "After the restoration of Lordlake, talk to Muroon near the HQ dock.",
        "Joins automatically after destroying Hatred Fortress.",
        "Joins automatically after the restoration of Lordlake.",
        "Joins automatically after the restoration of Lordlake.",
        "Joins automatically after the restoration of Lordlake.",
        "After the restoration of Lordlake, bring Viki to meet him in Raftfleet Inn. Can also be recruited later on at Lelcar or Doraat. Must bring Viki, or Faylen, or Norma. Do note that the Godwins will hire Wilhelm and Mueller at some point after you capture Doraat.")

    private val heroesImages = intArrayOf(R.drawable.prince01,
        R.drawable.lyon01,
        R.drawable.sairoh01,
        R.drawable.bozwilde01,
        R.drawable.luserina01,
        R.drawable.cornelio01,
        R.drawable.logg01,
        R.drawable.lun01,
        R.drawable.cius01,
        R.drawable.lelei01,
        R.drawable.lucretia01,
        R.drawable.raja01,
        R.drawable.kisara01,
        R.drawable.takamu01,
        R.drawable.josephine01,
        R.drawable.egbert01,
        R.drawable.shinro01,
        R.drawable.kyle01,
        R.drawable.chuck01,
        R.drawable.norden01,
        R.drawable.oboro01,
        R.drawable.fuyo01,
        R.drawable.shigure01,
        R.drawable.zegai01,
        R.drawable.sorenson01,
        R.drawable.viki01,
        R.drawable.zerase01,
        R.drawable.lorelai02,
        R.drawable.zweig01,
        R.drawable.muroon01,
        R.drawable.talgeyl01,
        R.drawable.goesch01,
        R.drawable.silva01,
        R.drawable.toma01,
        R.drawable.wilhelm01)

    val listData: ArrayList<Star>
        get() {
            val list = arrayListOf<Star>()
            for (position in starNames.indices) {
                val star = Star()
                star.name = starNames[position]
                star.recruit = starRecruit[position]
                star.photo = heroesImages[position]
                list.add(star)
            }
            return list
        }
}