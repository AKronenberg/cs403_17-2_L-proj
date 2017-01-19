package ms1
import org.scalatest.FunSpec
import org.scalatest.Matchers


class milestone1 extends FunSpec with Matchers {
  describe("Runs tests for The Game of Life virtual boardgame") {
  	describe("Checks game settings"){
  		it("Stops the game if turns are out of order or players start in the wrong position"){

        val showAreaResult = "Emily on " + GoL.ePos + ", Jacob on " + GoL.jPos + ", Michael on " + GoL.mPos + ", Sarah on " + GoL.sPos
        GoL.showArea should equal (showAreaResult)

			  val showOrderResult = "Emily, Jacob, Michael, Sarah"
  			GoL.showOrder should equal (showOrderResult) 			
  		
  			var advanceOrderResult = showOrderResult

			  if(advanceOrderResult == "Emily, Jacob, Michael, Sarah") advanceOrderResult = "Jacob, Michael, Sarah, Emily"
			  if(advanceOrderResult == "Jacob, Michael, Sarah, Emily") advanceOrderResult = "Michael, Sarah, Emily, Jacob"
			  if(advanceOrderResult == "Michael, Sarah, Emily, Jacob") advanceOrderResult = "Sarah, Emily, Jacob, Michael"
			  if(advanceOrderResult == "Sarah, Emily, Jacob, Michael") advanceOrderResult = "Emily, Jacob, Michael, Sarah"
			  GoL.advanceOrder should equal (advanceOrderResult)

  		}
  	}
  }
}

