import scala.collection.breakOut
import scala.collection.immutable.ListMap
import scala.collection.breakOut

object ExamenBigData {

  def Listevaleur(liste: List[String]):List[String]= {
    val new_list = liste.filter(s => s.endsWith("n"))
    return new_list
  }

  def avoirdomaine(lien:String) : String ={  //obtention des domaines
    return lien.replace("https://www.","").split("/")(0)
  }

  def liste_double(): Unit ={
    val Maliste = List(("ecommercemag.fr"," "),
      ("https://www.journalducm.com/contact/","Payant"),
      ("https://www.zatsaz.com/"," "),
      ("https://www.lerevenu.com/"," "),
      ("https://www.cadre-dirigfdeant-magazine.com/","Payant"),
      ("https://www.silicon.fr/services/contact#annoner","Payant"),
      ("https://www.channelbiz.fr/nous-contacter/"," "),
      ("https://www.itespresso.fr/"," "),
      ("https://www.industrie-mag.com/article4.html","invite"),
      ("https://www.jesuisundev.com/article-invite/","invite"),
      ("https://www.numerama.com/"," ")
    )
    // je cree d'abord une liste avec les domaines et ensuite je fais une fusion
    val finalListe =  (ListMap(Maliste:_*).keys.toList.map(l => avoirdomaine(l) ) zip ListMap(Maliste:_*).values).toList // funsionner les 2 dans une liste de tuple
    println(finalListe)
  }


  //l'affichade dans le main
  def main(args: Array[String]): Unit = {
    //affichage des valeurs
    println(Listevaleur(List("Julien","Paul","Jean","rac","trec","joel","ed","chris")))
    //affichage de la liste
    liste_double()


  }


}
