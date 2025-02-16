package org.example.lesson_5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val tagCitation: Elements = doc.select(".sc-2aegk7-2")
    var number = 1

    for (textCitation: Element in tagCitation) {
        println("${number++}) ${textCitation.text()}")
    }
}