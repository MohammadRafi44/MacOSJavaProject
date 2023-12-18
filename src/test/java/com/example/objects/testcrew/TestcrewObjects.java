package com.example.objects.testcrew;

import org.openqa.selenium.By;

public class TestcrewObjects {

    //    Header Objects
    public static final By HEADER_PHONE = By.xpath("//li[contains(@class,'nav-item text-222b5e')]//a[1]");
    public static final By HEADER_EMAIL = By.xpath("//span[text()[normalize-space()='info@testcrew.com']]");

    //    Menu Headers Objects
    public static final By HOME = By.xpath("//span[text()[normalize-space()='920033213 ( EXT# 103)']]");
    public static final By ABOUT_US = By.xpath("(//li[@class='nav-item']//a)[1]");
    public static final By SERVICES = By.xpath("(//li[@class='nav-item']//a)[2]");
    public static final By CLEINTS_PATNERS= By.xpath("(//li[@class='nav-item']//a)[3]");
    public static final By CASE_STUDIES = By.xpath("(//li[@class='nav-item']//a)[4]");
    public static final By NEWS = By.xpath("(//li[@class='nav-item']//a)[5]");
    public static final By BLOGS = By.xpath("(//li[@class='nav-item']//a)[6]");
    public static final By CONTACT_US= By.xpath("(//li[@class='nav-item']//a)[7]");

    //    Footer Objects
    public static final By FOOTER_TWITTER = By.xpath("(//a[contains(@class,'nav-link px-0')]//i)[1]");
    public static final By FOOTER_INSTAGRAM = By.xpath("(//a[contains(@class,'nav-link px-0')]//i)[2]");
    public static final By FOOTER_FACEBOOK = By.xpath("((//a[contains(@class,'nav-link px-0')]//i)[3]");
    public static final By FOOTER_LINKEDIN = By.xpath("(//a[contains(@class,'nav-link px-0')]//i)[4]");
    public static final By FOOTER_CONTACT_INFO = By.xpath("//li[contains(@class,'nav-item text-222b5e')]//a[1]");
    public static final By FOOTER_PRIVACY_POLICY = By.xpath("//div[@class='d-flex gap-2']//a[1]");
    public static final By FOOTER_NEWSLETTER_EMAIL = By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]");
    public static final By FOOTER_NEWSLETTER_BUTTON = By.xpath("//button[@type='submit']");
    public static final By FOOTER_NEWSLETTER_SUCCESS_TEXT = By.xpath("//div[@id='join-mail']//div[1]");








 /*   public static final By USER_NAME = By.name("Services");
    public static final By PASSWORD = By.name("password");
    public static final By LOGIN_BUTTON = By.xpath("//input[contains(@value, 'Test Login')]");
    public static final By MESSAGE = By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b");
    public static final By ADD_USER = By.xpath("//a[contains(text(), 'Add a User')]");
    public static final By SAVE_BUTTON = By.xpath("//input[@value='save']");*/
}
