package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class Hotels1 extends ElementUtil {

    private By cityName=By.id("qf-0q-destination");
    private By dropOpt1= By.xpath("//tr[@id='citysqm-asi0-s0']");
    private By checkIn= By.xpath(" //input[@id='qf-0q-localised-check-in']");
    private By checkOut = By.xpath("//input[@id='qf-0q-localised-check-out']");
    private By rooms = By.xpath("//select[@id='qf-0q-rooms']");
    private By search = By.xpath("//button[@class='cta cta-strong']");

    private By distance = By.xpath("//a[@data-menu='sort-submenu-distance']");
    private By cityCenter = By.xpath("//a[contains(text(),'City center')]");
    private By hotelName = By.xpath("//a[@class='property-name-link']");
    private By range = By.xpath("//ul[@class='property-landmarks']/li[1]");
    private By hotelWrap=By.className("hotel-wrap");
    private By endOfpage = By.xpath("//li[@class='expanded-area-message']");

    private By hotelStar = By.xpath("//span[@class='star-rating-text']");
    private By threeStar = By.xpath("//span[text()='3-star']");
    private By fourStar = By.xpath("//span[text()='4-star']");
    private By fiveStar = By.xpath("//span[text()='5-star']");



    public void sendCityName(String value){
        sendValue(cityName,value);
    }

    public void checkIn(String value){
        clear(checkIn);
        sendValue(checkIn,value);
    }

    public void checkOut(String value){
        clear(checkOut);
        sendValue(checkOut,value);
    }

    public void setRooms(String value){
        sendValue(rooms,value);
    }

    public void clickOnSearch(){
        clickOn(search);
    }

    public void clickOnCityCenter(){
        moveToElement(distance);
        clickOn(cityCenter);
    }




    public ArrayList<String[]> hotelNameList() {

        List<WebElement> hotelNames = webElements(hotelName);
        ArrayList<String[]> wholeList = new ArrayList<String[]>();

        int size=hotelNames.size();
        for(int i=0;i<size;i++) {
            scrollByPixel("0", "2000");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hotelNames = webElements(hotelName);
            size=hotelNames.size();
            if(size>=30){
                break;
            }
        }

        List<WebElement> rangeList = webElements(range);

        for (int i = 0; i < rangeList.size(); i++) {

            String range1 = rangeList.get(i).getText();

            String range2 = range1.replaceAll("[a-zA-Z ]", "");

            double distance = Double.parseDouble(range2);

            boolean isDistance = distance < 10.0;

            if (isDistance) {
                String distance1 = String.valueOf(distance);

                String hotelText = hotelNames.get(i).getText();

                String[] arrayForlist = {" Milage: ", distance1, " ", hotelText };
                wholeList.add(arrayForlist);

            }
        }
        return wholeList;
    }

    public void printMileageList(){
        System.out.println("---The hotels which are in 10 mile radius---");
        for (String[] a : hotelNameList()) {
            System.out.println(a[0] + a[1] + a[2] + a[3]);
        }
    }

    public void findHiltonHotels(){
        System.out.println("---The Hilton hotels which are in 10 mile radius---");
        for (String[] a : hotelNameList()) {
            if(a[3].contains("Hilton")) {
                System.out.println(a[0] + a[1] + a[2] + a[3]);
            }
        }
    }


}
