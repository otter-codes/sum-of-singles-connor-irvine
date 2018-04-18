import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "Sum Of Singles" must {

    "return the value of 1 when given a list of '1' " in {
      SumOfSingles.calculator(List(1,2,2)) mustEqual 1
    }

  }

}
