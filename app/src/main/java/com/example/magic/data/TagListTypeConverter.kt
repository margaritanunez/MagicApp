package com.example.magic.data

import androidx.room.TypeConverter
import com.google.gson.Gson

class TagListTypeConverter {

    @TypeConverter
    fun fromListToString(list: List<String>) = Gson().toJson(list)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<String>::class.java).toList()

}

/*
El código que has compartido es una clase llamada TagListTypeConverter, que probablemente esté
diseñada para ser utilizada en el contexto de la arquitectura de bases de datos y
Room Persistence Library en Android. Esta clase se utiliza para convertir entre una lista de cadenas
(strings) y su representación en formato JSON utilizando la biblioteca Gson.
La función de conversión se utiliza para permitir que Room almacene y recupere objetos complejos
 como listas en una base de datos SQLite.

class TagListTypeConverter: Se define una clase llamada TagListTypeConverter.
@TypeConverter: Esto indica que los métodos en esta clase son convertidores de tipo utilizados por
Room.
fun fromListToString(list: List<String>): Esta función recibe una lista de cadenas y la convierte en
una representación JSON utilizando la biblioteca Gson. En otras palabras, toma una lista de cadenas
y la convierte en una cadena JSON. Esta función probablemente se utilizará cuando se quiera
almacenar una lista de cadenas en la base de datos.

fun jsonToList(value: String): Esta función recibe una cadena en formato JSON y la convierte de
nuevo en una lista de cadenas utilizando la biblioteca Gson. La cadena JSON representa una lista de
cadenas, y esta función convierte esa cadena en una lista de cadenas de nuevo. Esta función
probablemente se utilizará cuando se quiera recuperar una lista de cadenas de la base de datos.
Gson(): Se crea una instancia de la clase Gson, que es una biblioteca de serialización y
deserialización JSON utilizada comúnmente en el ecosistema de Android.
toJson(list): Utiliza la instancia de Gson para convertir la lista de cadenas en una cadena JSON.
fromJson(value, Array<String>::class.java).toList(): Utiliza la instancia de Gson para convertir la
cadena JSON en un array de cadenas (Array<String>) y luego convierte ese array en una lista de
cadenas.

En resumen, esta clase se utiliza para convertir listas de cadenas en representaciones JSON y
viceversa utilizando la biblioteca Gson. Esto permite que las listas de cadenas se almacenen y
recuperen de una base de datos SQLite utilizando Room.

Explicación de San Germán
Lo primero es similar a lo que hacemos con el archivo Mapper solo que en vez de ponerlo como
 subfuncion el lo puso como funcion directa, o sea @TypeConverter
 // menciona que es una funcion que convierte información (creo que es dagger)
    fun fromListToString(list: List<String>)
    // aca crea la funcion y agrega la lista como lista de objetos
 = Gson().toJson(list)
 // y aca convierte la lista de objetos a json (el formato que obtenemos desde las api)
La segunda funcion es lo contrario, pide el json y lo convierte en una lista de objetos
 */