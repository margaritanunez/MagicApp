package com.example.magic.data.remote

data class Card(
    val artist: String,
    val cmc: Double,
    val foreignNames: List<ForeignName>,
    val id: String,
    val imageUrl: String,
    val layout: String,
    val legalities: List<Legality>,
    val manaCost: String,
    val multiverseid: Int,
    val name: String,
    val number: String,
    val originalText: String,
    val originalType: String,
    val rarity: String,
    val rulings: List<Ruling>,
    val `set`: String,
    val setName: String,
    val text: String,
    val type: String,
    val power: String,
    val toughness: String
)

/*
"cards": [
        {
            "name": "Ancestor's Chosen",
            "manaCost": "{5}{W}{W}",
            "cmc": 7.0,
            "rarity": "Uncommon",
            "set": "10E",
            "setName": "Tenth Edition",
            "text": "First strike (This creature deals combat damage before creatures without first strike.)\nWhen Ancestor's Chosen enters the battlefield, you gain 1 life for each card in your graveyard.",
            "artist": "Pete Venters",
            "number": "1",
            "power": "4",
            "toughness": "4",
            "layout": "normal",
            "multiverseid": "130550",
            "imageUrl": "http://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=130550&type=card",

            Estas variables no fueron consideradas-
            "variations": [
                "b7c19924-b4bf-56fc-aa73-f586e940bd42"
            ],
             "colors": [
                "W"
            ],
            "colorIdentity": [
                "W"
            ],
            "type": "Creature — Human Cleric",
            "types": [
                "Creature"
            ],
            "subtypes": [
                "Human",
                "Cleric"
            ],
 */