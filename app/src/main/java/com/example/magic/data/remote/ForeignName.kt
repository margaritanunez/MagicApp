package com.example.magic.data.remote

data class ForeignName(
    val flavor: String,
    val imageUrl: String,
    val language: String,
    val multiverseid: Int,
    val name: String,
    val text: String
)

/*
"foreignNames": [
                {
                    "name": "Elegido de la Antepasada",
                    "text": "Daña primero. (Esta criatura hace daño de combate antes que las criaturas sin la habilidad de dañar primero.)\nCuando el Elegido de la Antepasada entre en juego, ganas 1 vida por cada carta en tu cementerio.",
                    "type": "Criatura — Clérigo humano",
                    "flavor": "\"La voluntad de todos, realizada por mi mano.\"", // nunca  sabré por qué esta era Any
                    "imageUrl": "http://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=150317&type=card",
                    "language": "Spanish",
                    "multiverseid": 150317
                },
 */
