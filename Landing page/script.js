// JavaScript for Samsung Landing Page

// Samsung data
const samsungPhones = [
    {
        name: " Samsung Galaxy S24 Ultra",
        description: "Best Samsung phone overall",
        image: "https://images.samsung.com/is/image/samsung/p6pim/in/2401/gallery/in-galaxy-s24-s928-sm-s928bztqins-thumb-539573333?$172_172_PNG$"
    },
    {
        name: " Samsung Galaxy S24",
        description: "Best choice for most people",
        image: "https://images.samsung.com/is/image/samsung/p6pim/in/2401/gallery/in-galaxy-s24-492654-sm-s921bzyqins-thumb-539572851?$172_172_PNG$"
    },
    {
        name: " Samsung Galaxy S24 Plus",
        description: "Best big-screen Samsung phone",
        image: "https://images.samsung.com/is/image/samsung/p6pim/in/2401/gallery/in-galaxy-s24-plus-sm-s926bzvcins-thumb-539572990?$172_172_PNG$"
    },
    {
        name: " Samsung Galaxy Z Fold 5",
        description: "Best foldable Samsung phone",
        image: "https://images.samsung.com/in/smartphones/galaxy-z-fold5/images/galaxy-z-fold5-highlights-kv-a.jpg?imbypass=true"
    },
    {
        name: " Samsung Galaxy Z Flip 5",
        description: "Most affordable Samsung foldable",
        image: "https://images.samsung.com/in/smartphones/galaxy-z-flip5/images/galaxy-z-flip5-highlights-kv-a.jpg?imbypass=true/"
    },
    {
        name: " Samsung Galaxy A55 5G",
        description: "Best budget Samsung phone",
        image: "https://images.samsung.com/is/image/samsung/p6pim/in/sm-a556elbhins/gallery/in-galaxy-a55-5g-sm-a556-sm-a556elbhins-thumb-540254043?$172_172_PNG$"
    },
    
];

// Function to create Samsung phone cards
function createSamsungPhoneCards() {
    const container = document.getElementById("samsungCards");

    samsungPhones.forEach(phone => {
        const cardDiv = document.createElement("div");
        cardDiv.classList.add("col-12", "col-lg-4");

        const card = document.createElement("div");
        card.classList.add("card");

        const img = document.createElement("img");
        img.classList.add("card-img-top");
        img.src = phone.image;

        const cardBody = document.createElement("div");
        cardBody.classList.add("card-body");

        const title = document.createElement("h3");
        title.classList.add("card-title");
        title.textContent = phone.name;

        const description = document.createElement("p");
        description.classList.add("card-text");
        description.textContent = phone.description;

        cardBody.appendChild(title);
        cardBody.appendChild(description);

        card.appendChild(img);
        card.appendChild(cardBody);

        cardDiv.appendChild(card);
        container.appendChild(cardDiv);
    });
}

// Create Samsung phone cards when the page loads
document.addEventListener("DOMContentLoaded", createSamsungPhoneCards);
