import com.apollographql.apollo3.ApolloClient
import kotlin.test.Test

class MainTest {

  @Test
  fun testStuff() {
    try {
      ApolloClient.Builder()
        .serverUrl("http://0.0.0.0:1313/graphql")
        .build()
    } catch (e: ClassCastException) {
      console.error(e.cause)
      console.error(e.message)
      console.log(e.printStackTrace())
    }
    println("Ok")
  }
}