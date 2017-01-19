package ms1

object GoL {
  /*numbers are hardcoded at their starting positions for now, but they will be modified later in the game*/
  def ePos(): Int = 0
  def jPos(): Int = 3
  def mPos(): Int = 6
  def sPos(): Int = 9
  
  /*once again, strings are hardcoded here but will be edited at a later point in time.*/
  
  def showArea(): String = 
  "Emily on " + GoL.ePos + ", Jacob on " + GoL.jPos + ", Michael on " + GoL.mPos + ", Sarah on " + GoL.sPos

  def showOrder(): String = "Emily, Jacob, Michael, Sarah"
  
  def advanceOrder(): String = "Jacob, Michael, Sarah, Emily"
}