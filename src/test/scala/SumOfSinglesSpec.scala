import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "Sum Of Singles" must {


    "return the value of 0 when given a list of '' " in {
      SumOfSingles.calculator(List()) mustEqual 0
    }

    "return the value of 1 when given a list of '1' " in {
      SumOfSingles.calculator(List(1)) mustEqual 1
    }

    "return the value of 3 when given a list of '1, 2' " in {
      SumOfSingles.calculator(List(1,2)) mustEqual 3
    }

    "return the value of 1 when given a list of '1, 2, 2' " in {
      SumOfSingles.calculator(List(1,2,2)) mustEqual 1
    }

  }

}
