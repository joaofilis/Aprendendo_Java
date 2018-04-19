public class LinksAutomacao {

   // Atributo que guarda a url que sera acessada
   private final static String URL = "http://www.qualister.com.br/cursos";

   @Test
   public void test() {
      WebDriver driver = new FirefoxDriver();
      driver.get(URL);

      List<WebElement> links = obtemLinks(driver);
      listaCursosAutomacao(links);
      listaCursosPerformance(links);

      driver.quit();
   }

   // Metodo que retorna uma lista de elementos web que sao links na pagina
   public List<WebElement> obtemLinks(WebDriver driver) {
      return driver.findElements(By.cssSelector("a"));
   }

   /*
    * Metodo que lista os cursos de automacao
    * Ha a utilizacao de uma condicional (if) para verificar qual links tem o texto Automacao
    */
   public void listaCursosAutomacao(List<WebElement> links) {
      for (WebElement link : links) {
         if (link.getText().contains("Automação")) {
            System.out.println(link.getText());
         }
      }
   }
	
   /*
   * Metodo que lista os cursos de automacao
   * Ha a utilizacao de uma condicional (if) para verificar qual links tem o texto Performance
   */
   public void listaCursosPerformance(List<WebElement> links) {
      for (WebElement link : links) {
         if (link.getText().contains("Performance")) {
	   System.out.println(link.getText());
         }
      }
   }
}