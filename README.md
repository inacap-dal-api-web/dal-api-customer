# swagger-spring-boot-demo

**Why Swagger, You May Ask?**

Earlier, there were no industry standards for developing APIs or documenting them. Swagger emerged as an approach to building APIs and soon became the most popular framework for this purpose. Swagger is the largest framework for designing APIs using a common language and enabling the development across the whole API lifecycle, including documentation, design, testing, and deployment. The framework provides **a set of tools that help programmers generate client or server code and many more.**

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
