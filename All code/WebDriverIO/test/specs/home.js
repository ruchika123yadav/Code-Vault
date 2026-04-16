describe('Home', () => {
    it('Open URL and assert title', async () => { // async add karna mat bhulna
        await browser.url('https://practice.sdetunicorns.com/');

        // assert
        await expect(browser).toHaveTitle("Practice E-Commerce Site – SDET Unicorns");
    });

     it('Open About page and assert title', async () => { // async add karna mat bhulna
        await browser.url('https://practice.sdetunicorns.com/about/');

        // assert
        await expect(browser).toHaveUrl("https://practice.sdetunicorns.com/about/");
    });

     it('Click get started btn and asset url contains get-started text', async () => { // async add karna mat bhulna
        await browser.url('https://practice.sdetunicorns.com/');
        await $('#get-started').click()
    // $ inside it ,it can be anything id,class,cssSelector anything
    
        // assert
await expect(browser).toHaveUrl(expect.stringContaining("get-started"));
    });

     it('Click logo and assert url does not contains get-started text', async () => { // async add karna mat bhulna
        await browser.url('https://practice.sdetunicorns.com/');
         
        await $('//img[@alt="Practice E-Commerce Site"]').click()
    
        // assert
        await expect(browser).not.toHaveUrl(expect.stringContaining("get-started"));
    });


     it('Find heading element & assert the text', async () => {
    // Open Home Page
    await browser.url('https://practice.automationbro.com');

    // find heading element
    const headingEl = await $('.elementor-widget-container h1');

    // get the text
    const headingText = await headingEl.getText();

    // Assert the text
    // await expect(headingText).toEqual('Think different. Make different.');
    await expect(headingEl).toHaveText('Think different. Make different.');
});
});