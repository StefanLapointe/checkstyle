/*xml
<module name="Checker">
  <module name="RegexpSingleline">
    <property name="format" value="System.exit\("/>
    <!-- next line not required as 0 is the default -->
    <property name="minimum" value="0"/>
    <property name="maximum" value="1"/>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.regexp.regexpsingleline;
// xdoc section -- start
public class Example2 {
  void myFunction() {
    try {
      doSomething();
    } catch (Exception e) {
      System.exit(1); // ok, as only there is only one occurrence.
    }
  }

  void doSomething(){}
}
// xdoc section -- end
