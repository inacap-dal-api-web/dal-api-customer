
# Dal-api-customer

Data Access Layer API Interface to Customer query

## Comenzando 🚀

```
Instalar git
url: https://git-scm.com/downloads
```


```
Instalar Java 1.8
url: https://www.oracle.com/cl/java/technologies/javase/javase8-archive-downloads.html
```

```
Instalar IntellJ
url: https://www.jetbrains.com/es-es/idea/download/
```

```
Instalar XAMPP o WAMP Server
url wampp-server: https://www.wampserver.com/en/
url xampp: https://www.apachefriends.org/es/index.html
```

Mira **Deployment** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

```
Conexión a Internet
- Café
- Animos
- Analisis
- Paciencia
- Carisma
- Amor
```


### Instalación 🔧


Bajamos el proyecto

```
url: https://github.com/inacap-dal-api-web/dal-api-customer.git
```

### Omitir si utilizamos Fork***

Comando en Terminal
```
git clone https://github.com/inacap-dal-api-web/dal-api-customer.git
```

Dentro de la carpeta donde hemos descargado el repositorio
```
Ejemplo: C:/Usuarios/Desarrollador/Documents/dal-api-customer

Vamos a cambiar de rama
```

Comando en Terminal
```
git checkout feature/develop
```

***Una vez descargado el proyecto, lo abrimos con el IDE IntelliJ***
```
Necesitará el descargar todas las dependencias asociadas, por lo tanto debemos esperar.
```



## Despliegue o BootRUN 📦



## Construido con Maven y JavaSpring 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [SpringBoot](https://spring.io/projects/spring-boot) - El framework Rest
* [Maven](https://maven.apache.org/) - Manejador de dependencias




## Versionado 📌

Fork

## Autores ✒️



* **Andrés Villanueva** - *Trabajo Inicial* - [villanuevand](https://github.com/villanuevand)
* **Fulanito Detal** - *Documentación* - [fulanitodetal](#fulanito-de-tal)



## Licencia 📄

Este proyecto está bajo la Licencia (Recero) - mira el archivo [LICENSE.md](LICENSE.md) para detalles

## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo. 
* Da las gracias públicamente 🤓.
* etc.



---


# Inacap dal-api-custome

**Configuración de proyecto**

Versión: 1.0.0
Branch: feature/develop
Indicaciones de subida a Rama Master:
        - Solamente cuando se tengan todos los endpoints introducidos se generara la carga a la rama Master
        - Cada vez que se cree una nueva implementación se debe crear de la mano de la rama feature/develop
        - La nomenclatura de cada rama debe de ser 
                Ejemplos:
                        feature/**login**
                        feature/**dashboard**
                        feature/**administracion**
                        feature/**peticiones**
                        feature/**mapas**
                        **etc**

# Code generation 
```xml

<plugin>
	<groupId>io.swagger</groupId>
	<artifactId>swagger-codegen-maven-plugin</artifactId>
	<version>${swagger-codegen-maven-plugin-version}</version>
	<executions>
		<execution>
			<phase>generate-sources</phase>
			<goals>
				<goal>generate</goal>
			</goals>
			<configuration>
				#Todo lo que hemos creado dentro de swagger.editor hemos de insertarlo dentro de este archivo .yml
				<inputSpec>${project.basedir}/swagger/rest-api-definition-master.yml</inputSpec> 
				<language>spring</language>
				<generateApis>true</generateApis>
				<generateModels>true</generateModels>
				<generateModelDocumentation>false</generateModelDocumentation>
				<generateModelTests>false</generateModelTests>
				<generateSupportingFiles>true</generateSupportingFiles>
				#El Package modelsEntityAndResponse tendra el mapeo de Entidad y la Respuesta
				<modelPackage>recero.modelsEntityAndResponse</modelPackage>
				#El Package recero.apiInterface será la interface que se une en SpringBoot extends ApiRecero
				<apiPackage>recero.apiInterface</apiPackage>
				<configOptions>
					<dateLibrary>java8</dateLibrary>
					<sourceFolder>ApiGenerated</sourceFolder>
					<interfaceOnly>true</interfaceOnly>
					<useTags>true</useTags>

				</configOptions>
				<output>${project.build.directory}/generated-sources/java</output>
			</configuration>
		</execution>
	</executions>
</plugin>

```
 You can check for more from [dzone.com](https://dzone.com/articles/openapi-swagger-and-spring-boot-integration)
