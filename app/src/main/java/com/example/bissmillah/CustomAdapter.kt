import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.bissmillah.R

class CustomAdapter(private val context: Context, private val data: List<Map<String, Any>>) : BaseAdapter() {

    override fun getCount(): Int = data.size

    override fun getItem(position: Int): Any = data[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = convertView ?: inflater.inflate(R.layout.grid_data_loop, parent, false)

        val textNama: TextView = view.findViewById(R.id.textNama)
        val textTelp: TextView = view.findViewById(R.id.textTelp)

        val item = data[position]
        textNama.text = "Nama: ${item["nama"]}"
        textTelp.text = "Telp: ${item["telp"]}"

        return view
    }
}