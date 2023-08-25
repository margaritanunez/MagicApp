package com.example.magic.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    class PhoneRetrofitClient {
        companion object{
            private const val BASE_URL = "https://api.magicthegathering.io/v1/"

            /*var okHttpClient = OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build()

             */

            /*Utiliza la biblioteca OkHttpClient para crear una instancia de un cliente HTTP.
            Este cliente HTTP se configura con ciertos parámetros de tiempo de espera
            y luego se construye para estar listo para realizar solicitudes a servidores remotos.
            var okHttpClient: se declara una variable que se utiliza para almacenar la instancia
            del cliente HTTP que estamos construyendo.
            OkHttpClient.Builder(): Se crea una instancia de OkHttpClient.Builder, que es un
            constructor de objetos utilizado para configurar y construir una instancia de
            OkHttpClient.
            .connectTimeout(1, TimeUnit.MINUTES): Se configura el tiempo máximo que el cliente
            intentará conectarse a un servidor remoto. En este caso, se establece un tiempo de
            espera de 1 minuto para la conexión utilizando la unidad de tiempo TimeUnit.MINUTES.
            .readTimeout(30, TimeUnit.SECONDS): Se configura el tiempo máximo que el cliente
            esperará para leer datos de la respuesta del servidor. Aquí, se establece un tiempo de
            espera de 30 segundos para la lectura de datos utilizando la unidad de tiempo
            TimeUnit.SECONDS.
            .writeTimeout(30, TimeUnit.SECONDS): Se configura el tiempo máximo que el cliente
            esperará para escribir datos en la solicitud al servidor. Igual que el tiempo de lectura,
            se establece un tiempo de espera de 30 segundos para la escritura de datos utilizando la
            unidad de tiempo TimeUnit.SECONDS.
            .build(): Una vez que se han configurado todos los parámetros del cliente HTTP mediante
            los métodos anteriores, se llama al método build() para crear una instancia final de
            OkHttpClient con la configuración proporcionada.

            En resumen, este código crea una instancia de OkHttpClient y la configura con tiempos
            máximos de espera para la conexión, la lectura y la escritura en las solicitudes y
            respuestas de los servidores remotos. Este cliente HTTP puede luego ser utilizado para
            realizar solicitudes HTTP, como obtener recursos desde un servidor, enviar datos, etc.

            Explicación de San Germán
            Lo segundo es que toda llamada a internet tiene tiempos que estara activa,
            por ende el OkHttpClient (que es un simil de Retrofit) esta configurandose ahi para que
            tenga 1 minuto para el timeout, 30 segundos de espera para recibir la info y 30 segundos
            de espera para enviar la info
             */

            fun getRetrofitPhone() : MagicApi{
                val mRetrofit = Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()
                return mRetrofit.create(MagicApi::class.java)
            }
        }
    }
}