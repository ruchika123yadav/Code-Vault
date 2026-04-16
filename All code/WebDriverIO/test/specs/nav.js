describe('Navigation Menu',  () => {
    it('Get the text of all menu items and assert them using wait commands ', async() => {
        
        await browser.url("/")

        const expectedLinks = [
    "Home",
    "About",
    "Shop",
    "Blog",
    "Contact",
    "My account",
];

const actualLinks = [];

// const navLinks = await $('#primary-menu').$$('li[id*=menu]');
const navLinks = await $$('#primary-menu li[id*=menu]');

for (const link of navLinks) {
    actualLinks.push(await link.getText());
}

await expect(expectedLinks).toEqual(actualLinks);
    });


    //to run that specific test only
    it.only('Get the text of all menu items and assert them ', async() => {
        // browser.pause(50000);//hardcoded wait
          browser.url("/")

        const expectedLinks = [
    "Home",
    "About",
    "Shop",
    "Blog",
    "Contact",
    "My account",
];

const actualLinks = [];

// const navLinks = await $('#primary-menu').$$('li[id*=menu]');
await $('#primary-menu').waitForDisplayed({timeout:2000})
await $('#primary-menu').waitForClickable({timeout:2000})

const navLinks = await $$('#primary-menu li[id*=menu]').waitForDisplayed({timeout:2000});

for (const link of navLinks) {
    actualLinks.push(await link.getText());
}

await expect(expectedLinks).toEqual(actualLinks);
    });
});