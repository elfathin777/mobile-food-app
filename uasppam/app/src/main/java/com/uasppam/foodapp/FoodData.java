package com.uasppam.foodapp;

import android.content.Context;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Batagor merupakan nama makanan dari singkatan bakso, tahu, dan goreng. Makanan khas Sunda ini adalah adaptasi dari hidangan Tionghoa-Indonesia.", 10000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Salad adalah makanan sehat yang banyak digemari orang.", 15000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Caphuchino", "Cappuccino merupakan kopi yang populer dari Italia karena lebih sering dan lebih banyak dikonsumsi. Rasanya yang tidak terlalu pahit seperti espresso, membuat cappuccino lebih mudah diterima oleh lidah semua orang khususnya kalangan muda. Komposisinya terdiri atas espresso dan tambahan susu cair serta busa di atasnya.", 15000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "adalah kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula.", 12000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng", "Cireng adalah camilan dari tepung aci yang dipipihkan kemudian digoreng. Itu sebabnya nama makanan ini cireng yang berasal dari singkatan aci digoreng. Cara membuat cireng juga sangat mudah. Pertama, kamu bisa membuat adonan biang yang dibuat dari sedikit tepung aci dan air yang direbus sampai menyerupai lem.", 10000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut", "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. Donat yang paling umum adalah donat berbentuk cincin dengan lubang di tengah dan donat berbentuk bundar dengan isian manis, seperti selai, jelly, krim, dan custard", 15000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Kopi Hitam", "Kopi hitam, merupakan hasil ektraksi langsung dari perebusan biji kopi yang disajikan tanpa penambahan perisa apapun. Espreso, merupakan kopi yang dibuat dengan mengekstraksi biji kopi menggunakan uap panas pada tekanan tinggi.", 15000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Mi goreng berarti 'mi yang digoreng' adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia. Mi goreng juga populer dan juga digemari di Malaysia, dan Singapura. Mi goreng terbuat dari mi kuning yang digoreng dengan sedikit minyak goreng, dan ditambahkan bawang putih, bawang merah, udang serta daging ayam atau daging sapi, irisan bakso, cabai, sayuran, tomat, telur ayam, dan acar.", 10000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.", 20000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Sparkling Tea", "Mau minuman teh yang spesial dan menyegarkan? Kamu bisa mencoba sparkling tea.Segarnya soda berpadu dengan lemon dan daun mint. Cocok banget dinikmati saat siang hari.", 12000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
