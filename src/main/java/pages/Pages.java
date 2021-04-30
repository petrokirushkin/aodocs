package pages;

public class Pages {

    private static ContactPage contactPage;
    private static NavigationPage navigationPage;
    private static GooglePage googlePage;

    public static ContactPage contactPage() {
        if (contactPage == null) {
            contactPage = new ContactPage();
        }
        return contactPage;
    }

    public static NavigationPage navigationPage() {
        if (navigationPage == null) {
            navigationPage = new NavigationPage();
        }
        return navigationPage;
    }

    public static GooglePage googlePage() {
        if (googlePage == null) {
            googlePage = new GooglePage();
        }
        return googlePage;
    }
}
