# Agenda de Contactos - Documentación

> Nombres de los integrantes
> Carlos Lara - Jerardo Morales - Hawer Morelos - Diego Arias - Yeshua Martínez

[Vídeo de youtube link privado con el vídeo](https://youtu.be/bETdnRey4Lg)

Esta es una aplicación de agenda de contactos desarrollada en Java, utilizando el entorno de desarrollo Swing para la interfaz gráfica. La aplicación permite gestionar contactos, tipos de contacto y números de teléfono asociados a los contactos.

## Contenido

1. [Estructura del Proyecto](#1-estructura-del-proyecto)
2. [Clases y Funcionalidades](#2-clases-y-funcionalidades)
3. [Instrucciones de Uso](#3-instrucciones-de-uso)
4. [Compilación y Ejecución](#4-compilación-y-ejecución)

## 1. Estructura del Proyecto

El proyecto consta de varias clases Java que están organizadas en paquetes. Aquí se describen brevemente los paquetes y las clases más relevantes:

- **clases**: Contiene las clases `Contacto`, `Numero`, `Tipo`, que representan a un contacto y a un tipo de contacto, respectivamente.
- **vistas**: Contiene las clases relacionadas con la interfaz gráfica.
  - `VistaContactos`: La interfaz principal de la aplicación para gestionar contactos.
  - `VistaNumeros`: Ventana para gestionar números de teléfono asociados a un contacto.
  - `VistaTipos`: Ventana para gestionar los tipos de contacto.
  - `VistaModificar`: Ventana para modificar un contacto existente.

## 2. Clases y Funcionalidades

### 2.1 `Contacto`

La clase `Contacto` representa a un contacto y tiene los siguientes atributos:

- `codigo`: Un identificador único para cada contacto.
- `nombre`: El nombre del contacto.
- `apellido`: El apellido del contacto.

### 2.2 `Tipo`

La clase `Tipo` representa a un tipo de contacto y tiene los siguientes atributos:

- `codigoTipo`: Un identificador único para cada tipo.
- `nombreTipo`: El nombre del tipo de contacto.

### 2.3 `VistaContactos`

La clase `VistaContactos` es la interfaz principal de la aplicación. Permite agregar, eliminar, modificar contactos, así como gestionar tipos y números de teléfono asociados a los contactos.

Funcionalidades clave:

- **Agregar Contacto**: Se puede agregar un nuevo contacto con un nombre y apellido.
- **Eliminar Contacto**: Permite eliminar un contacto seleccionado.
- **Modificar Contacto**: Permite modificar los datos de un contacto seleccionado.
- **Gestionar Tipos**: Abre la ventana para gestionar tipos de contacto.
- **Gestionar Números**: Abre la ventana para gestionar números de teléfono de un contacto.

### 2.4 `VistaNumeros`

La clase `VistaNumeros` permite gestionar los números de teléfono asociados a un contacto. Se pueden agregar, eliminar y modificar números de teléfono.

### 2.5 `VistaTipos`

La clase `VistaTipos` permite gestionar los tipos de contacto. Permite agregar, eliminar y modificar tipos de contacto.

### 2.6 `VistaModificar`

La clase `VistaModificar` es una ventana que permite modificar los datos de un contacto existente. Se utiliza desde la interfaz principal.

## 3. Instrucciones de Uso

1. **Inicio de la Aplicación**: Al ejecutar la aplicación (`VistaContactos`), se abrirá la interfaz principal de la agenda de contactos.

2. **Agregar Contacto**: Se puede agregar un nuevo contacto ingresando el nombre y apellido en los campos correspondientes y haciendo clic en el botón "GUARDAR".

3. **Eliminar Contacto**: Para eliminar un contacto, seleccionar un registro en la tabla y hacer clic en el botón "ELIMINAR".

4. **Modificar Contacto**: Seleccionar un contacto en la tabla y hacer clic en el botón "MODIFICAR" para abrir una ventana donde se pueden realizar cambios en los datos del contacto.

5. **Gestionar Tipos**: Hacer clic en el botón "ADD TIPO" para abrir la ventana de gestión de tipos. Desde esta ventana se pueden agregar, eliminar y modificar tipos de contacto.

6. **Gestionar Números**: Seleccionar un contacto en la tabla y hacer clic en el botón "NUMEROS" para abrir la ventana de gestión de números de teléfono asociados a ese contacto.

7. **Cancelar y Cerrar**: Hacer clic en el botón "CANCELAR" para cerrar la aplicación.

## 4. Compilación y Ejecución

1. **Compilación**: Para compilar el proyecto, es necesario tener instalado un entorno de desarrollo Java (por ejemplo, [Eclipse](https://www.eclipse.org/) o [NetBeans](https://netbeans.apache.org/)). Importar el proyecto y compilar las clases.

2. **Ejecución**: Ejecutar la clase `VistaContactos` para iniciar la aplicación.

**Nota**: Asegurarse de tener instalada una máquina virtual de Java (JVM) en el sistema.

Este documento proporciona una descripción general de la aplicación y las instrucciones básicas para su uso y ejecución. Para obtener más detalles sobre la implementación, se recomienda revisar el código fuente y los comentarios en el mismo.
