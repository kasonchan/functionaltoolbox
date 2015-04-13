package demo

/**
 * Created by kasonchan on 4/13/15.
 */
case class Credentials(username: String, password: String)

case class User(firstname: String, middlename: String, lastname: String, credentials: Credentials)

object Demo extends io.IO {

  def compSort(u1: User, u2: User) = {
    if (u1.firstname != u2.firstname)
      u1.firstname < u2.firstname
    else if (u1.lastname != u2.lastname)
      u1.lastname < u2.lastname
    else
      u1.credentials.username < u2.credentials.username
  }

  def firstnameComparison(u1: User, u2: User) =
    u1.firstname.compareTo(u2.firstname)

  def lastnameComparison(u1: User, u2: User) =
    u1.lastname.compareTo(u2.lastname)

  def usernameComparison(u1: User, u2: User) =
    u1.credentials.username.compareTo(u2.credentials.username)

  def makeComparison(comparisons: ((User, User) => Int)*) = {
    (u1: User, u2: User) =>
      comparisons.map(cmp => cmp(u1, u2)).find(_ != 0).getOrElse(0)
  }

  def main(args: Array[String]) {
    val u1 = User("Louis", "", "Chan", Credentials("louischan", "12345678"))
    val u2 = User("Bernice", "", "Chan", Credentials("bernicechan", "12345678"))
    val u3 = User("Osborn", "", "Wu", Credentials("osbornwu", "12345678"))
    val u4 = User("A", "A", "A", Credentials("a", "12345678"))
    val u5 = User("Louis", "Bird", "Chan", Credentials("lcc", "12345678"))

    val users = Vector(u1, u2, u3, u4, u5)

    //    Replace functional interface with anonymous functions
    val sortWithFirstname = users.sortWith((u1, u2) => u1.firstname < u2.firstname)
    val sortWithLastname = users.sortWith((u1, u2) => u1.lastname < u2.lastname)
    val sortWithUsername = users.sortWith((u1, u2) => u1.credentials.username < u2.credentials.username)

    //    Print anonymous function result with echo function
    echo(sortWithFirstname)
    echo(sortWithLastname)
    echo(sortWithUsername)

    echo("")

    //    Replace functional interface with named functions
    val sortWithCompSort = users.sortWith(compSort)

    //    Print named function result with echo function
    echo(sortWithCompSort)

    echo("")

    //    Replace state-carrying function interface
    val complicatedComparison = makeComparison(firstnameComparison, lastnameComparison, usernameComparison)

    val compareU1U2 = complicatedComparison(u1, u5)
    echo(compareU1U2)
  }
}
