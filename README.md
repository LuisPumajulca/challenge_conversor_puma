# challenge_conversor_puma

<h4 align="center">
:construction: Proyecto en construcción :construction:
</h4>

# Conversor de Moneda 💱

Este es un proyecto de conversor de moneda que utiliza la API pública ExchangeRate-API para obtener tasas de cambio en tiempo real. Permite a los usuarios convertir entre varias monedas y mantener un historial de sus conversiones.

## :hammer: Funcionalidades del proyecto

1. **Selección de monedas:** Permite al usuario elegir entre varias opciones de conversión de moneda.

2. **Conversión de moneda:** Realiza la conversión de moneda basada en las tasas de cambio proporcionadas por la API ExchangeRate-API.

3. **Historial de conversiones:** Mantiene un registro de las conversiones realizadas durante la sesión actual y permite al usuario verlas en cualquier momento.

## :wrench: Tecnologías utilizadas

- Java 16
- Gson 2.10.1


## 📁 Como descargar el proyecto y obtener una ApiKey

1. **Clona este repositorio en tu máquina local:
git clone https://github.com/tu-usuario/conversor-de-moneda.git**

2. **Obtén una clave de API gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/)**

3. **Puedes abrirlo desde cualquier editor de texto: Apache NetBeans, IntelliJ IDEA, Eclipse,Visual Studio code**

## 🛠️ Configuracion del proyecto

**Una vez abierto el proyecto reemplaza 'YourApiKey' en la URL de la API con tu clave de API.**

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/YourApiKey/latest/";

### :arrow_down: Cómo agregar la librería Gson al proyecto

1. **Descargar Gson desde Maven Repository:**
    - Visita la página de [Maven Repository para Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1).
    - Haz clic en la versión más reciente de Gson.
    - En la página de detalles de la versión, busca el enlace "jar" en la sección "Files" y haz clic en él para descargar el archivo jar de Gson.

2. **Agregar Gson al proyecto en IntelliJ IDEA:**
    - Abre IntelliJ IDEA y tu proyecto.
    - Haz clic en *"File"* luego busca y click en *"Project Structure..."* te abrira otra ventana, ve en la pestaña *"Dependencies"*.
    - Click en el boton *"+"* , luego click en *"JARs or Directories"* , buscas el jar descargado seleccionas y das "*OK"*.
    - IntelliJ IDEA agregará la librería Gson a tu proyecto y podrás usarla en tu código.

## Autores

| [<img src="" width=115><br><sub>Luis Pumajulca Urbano</sub>](https://github.com/LuisPumajulca)  |

