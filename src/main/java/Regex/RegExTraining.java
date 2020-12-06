package Regex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static constants.SitesUrls.url4;
import static driver.SetUpChromeDriver.getChromeDriver;

public class RegExTraining {

    public void regExList(String name, List<String> values, String pattern) {
        for (String item : values) {
            Pattern replacementPattern = Pattern.compile(pattern);
            Matcher matcher = replacementPattern.matcher(item);
            if (matcher.find()) {
                System.out.println(name + ": " + matcher.group(0));
            }
        }
    }

    public static List<String> testDataForEmail() {
        List<String> values = new ArrayList<String>();
        String email1 = "Svitlana_Bychevska@epam.com";
        String email2 = "Bychevska@ukr.net";
        String email3 = "Svitlana.Bychevska@mckesson.com";
        String email4 = "Svitlana.Bychevska@&mckesson.com";
        values.add(email1);
        values.add(email2);
        values.add(email3);
        values.add(email4);
        return values;
    }
    public static List<String> testDataForIP() {
        List<String> values = new ArrayList<String>();
        String ip1 = "4a5.2587.25.26";
        String ip2 = "456.258.365.158";
        String ip3 = "14.25.26.8";
        String ip4 = "125.36.256.365";
        values.add(ip1);
        values.add(ip2);
        values.add(ip3);
        values.add(ip4);
        return values;
    }
    public static List<String> testDataForBankCard() {
        List<String> values = new ArrayList<String>();
        String bankCard1 = "45 85% 4568 4587";
        String bankCard2 = "1234 5687 5698 8745";
        String bankCard3 = "54 857 6985 2";
        String bankCard4 = "125.36.256.365";
        values.add(bankCard1);
        values.add(bankCard2);
        values.add(bankCard3);
        values.add(bankCard4);
        return values;
    }
public void getAndPrintEpamAddressElements() {
    getChromeDriver().get(url4);
    getChromeDriver().manage().window().fullscreen();
    WebElement searchField = getChromeDriver().findElement(By.xpath("//b//span[@class='font-size-22']"));
    String textAddress = searchField.getText();
    System.out.println(textAddress);
    Pattern replacementPattern = Pattern.compile("(\\d+ \\w+ \\w+) • (\\w+ \\d+),\\n(\\w+), (\\w{2} \\d+) • (\\w{3})");
    Matcher matcher = replacementPattern.matcher(textAddress);
    if (matcher.find()) {
        for (int i=1; i<matcher.groupCount()+1; i++)
        System.out.println("Group_" + i + ": " + matcher.group(i));
    }
    getChromeDriver().close();
}

    public static void main(String[] args) {
        String patternEmail = "(^(\\w+)|(\\w+[.]\\w+)|(\\w+[_]\\w+))[@]\\w+[.]\\w{3}";
        String patternIP = "([0-9]{1,3}[.]){3}[0-9]{1,3}";
        String patternBankCard = "([0-9]{4}[ ]){3}[0-9]{4}";

        RegExTraining objRegEx = new RegExTraining();
        List<String> dataForEmail = testDataForEmail();
        objRegEx.regExList("RegEx for email", dataForEmail, patternEmail);

        RegExTraining objRegEx2 = new RegExTraining();
        List<String> dataForIP = testDataForIP();
        objRegEx2.regExList("RegEx for IP", dataForIP, patternIP);

        RegExTraining objRegEx3 = new RegExTraining();
        List<String> dataForBankCard = testDataForBankCard();
        objRegEx3.regExList("RegEx for BankCard", dataForBankCard, patternBankCard);

        RegExTraining objRegEx4 = new RegExTraining();
        objRegEx4.getAndPrintEpamAddressElements();
    }
}