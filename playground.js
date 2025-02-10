/*
Assessment Requirements
1. Create a variable that can hold a number of NFT's. What type of variable might this be?
2. Create an object inside your mintNFT function that will hold the metadata for your NFTs. 
   The metadata values will be passed to the function as parameters. When the NFT is ready, 
   you will store it in the variable you created in step 1
3. Your listNFTs() function will print all of your NFTs metadata to the console (i.e. console.log("Name: " + someNFT.name))
4. For good measure, getTotalSupply() should return the number of NFT's you have created
*/

// create a variable to hold your NFT's
const paapi = [];
// this function will take in some values as parameters, create an
// NFT object using the parameters passed to it for its metadata,
// and store it in the variable above.
function mintNFT(name, skinColor, shirt, age, bling) {
  const pa_nft = {
    Name: name,
    Skin_color: skinColor,
    Shirt: shirt,
    Age: age,
    Bling: bling,
  };
  paapi.push(pa_nft);
  console.log("Name : " + name);
}

// create a "loop" that will go through an "array" of NFT's
// and print their metadata with console.log()
function listNFTs() {
  for (let i = 0; i < paapi.length; i++) {
    console.log(
      `\nNFT ID:${i + 1} , Name: ${paapi[i].Name} , Skin_color: ${
        paapi[i].Skin_color
      } , Shirt: ${paapi[i].Shirt} , Age: ${paapi[i].Age} , Bling: ${
        paapi[i].Bling
      }`
    );
  }
}

// print the total number of NFTs we have minted to the console
function getTotalSupply() {
  return paapi.length;
}

// call your functions below this line
mintNFT("Paravdeep", "IVORY", "Suits", "20", "Golden Bracelet");
mintNFT("Sagar", "CACAO", "Shirt", "23", "Golden Chain");
mintNFT("Anshul", "BLACK", "Skirt", "10", "Silver Bracelet");
mintNFT("Walia", "ALMOND", "Sando", "21", "Rose Gold Ring");
listNFTs();
console.log("\nNumber of NFTs created is: " + getTotalSupply());
