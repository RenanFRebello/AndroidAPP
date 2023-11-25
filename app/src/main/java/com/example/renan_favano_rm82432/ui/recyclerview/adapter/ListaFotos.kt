import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.renan_favano_rm82432.R
import com.example.renan_favano_rm82432.modelo.Fotos

class ListaFotos(
    private val context: Context,
    private val fotos:List<Fotos>
) : RecyclerView.Adapter<ListaFotos.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(fotos1: Fotos) {
         val drone =  itemView.findViewById<TextView>(R.id.drone)
         drone.text = fotos1.drone
         val loc = itemView.findViewById<TextView>(R.id.localizacao)
         loc.text = fotos1.loc
         val lavoura = itemView.findViewById<TextView>(R.id.lavoura)
         lavoura.text = fotos1.lavoura
         val pragas = itemView.findViewById<TextView>(R.id.pragas)
         pragas.text = fotos1.pragas
         val adubo = itemView.findViewById<TextView>(R.id.adubo)
         adubo.text = fotos1.adubo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater =  LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.fotos_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fotos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fotos1 = fotos[position]
        holder.vincula(fotos1)

    }

}
