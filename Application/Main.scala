package Application

import scalafx.Include._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.MenuBar
import scalafx.scene.control.Menu
import scalafx.scene.control.MenuItem
import scalafx.scene.control.SeparatorMenuItem
import scalafx.scene.layout.BorderPane

object DrawingMain extends JFXApp{
    stage = new JFXApp.PrimaryStage{
        title = "Scala Padlet"
        scene = new Scene(800,600){
            val menuBar = new MenuBar
            val fileMenu = new Menu("File")
            val newFileItem = new MenuItem("New File")
            val openItem = new MenuItem("Open ...")
            val saveItme = new MenuItem("Save")
            val exitItem = new MenuItem("Exit")
            fileMenu.items = List(newFileItem,openItem,saveItme,new SeparatorMenuItem, exitItem)
            val editMenu = new Menu("Edit")
            val addItem = new MenuItem("Add")
            val copyItem = new MenuItem("Copy")
            val cutItem = new MenuItem("Cut")
            val pasteItem = new MenuItem("Paste")
            editMenu.items = List(addItem,copyItem,cutItem,pasteItem)
            menuBar.menus = List(fileMenu,editMenu)

            val rootPane = new BorderPane
            rootPane.top = menuBar

            root = rootPane
        }
    }

}