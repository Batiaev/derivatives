package com.batiaev.derivatives.api

import com.batiaev.derivatives.api.model.BaseAsset
import org.springframework.stereotype.Component

/**
 * AssetRepository
 *
 * @author anton
 * @since 18/12/17
 */
@Component
class AssetRepository {
    private val assets = HashMap<String, BaseAsset>()

    operator fun get(assetCode: String): BaseAsset {
        return assets.getOrDefault(assetCode, BaseAsset(assetCode, null, null))
    }

    init {
        //Индексные контракты
        assets.put("MX", BaseAsset("MX", "MIX", "Индекс ММВБ"))
        assets.put("MM", BaseAsset("MM", "MXI", "Индекс ММВБ (мини)"))
        assets.put("RI", BaseAsset("RI", "RTS", "Индекс РТС"))
        assets.put("RS", BaseAsset("RS", "RTSS", "Индекс голубых фишек"))
        assets.put("4B", BaseAsset("4B", "ALSI", "Индекс FTSE/JSE Top40"))
        assets.put("VI", BaseAsset("VI", "RVI", "Волатильность российского рынка"))
        //Фондовые контракты
        assets.put("AF", BaseAsset("AF", "AFLT", "ПАО \"Аэрофлот\" (о.а.)"))
        assets.put("AL", BaseAsset("AL", "ALRS", "АК \"АЛРОСА\" (ПАО) (о.а.)"))
        assets.put("CH", BaseAsset("CH", "CHMF", "ПАО \"Северсталь\" (о.а.)"))
        assets.put("FS", BaseAsset("FS", "FEES", "ПАО \"ФСК ЕЭС\" (о.а.)"))
        assets.put("GZ", BaseAsset("GZ", "GAZR", "ПАО \"Газпром\" (о.а.)"))
        assets.put("GM", BaseAsset("GM", "GMKR", "ПАО ГМК \"Норильский Никель\" (о.а.)"))
        assets.put("HY", BaseAsset("HY", "HYDR", "ПАО \"РусГидро\" (о.а.)"))
        assets.put("LK", BaseAsset("LK", "LKOH", "ПАО НК \"ЛУКОЙЛ\" (о.а.)"))
        assets.put("MN", BaseAsset("MN", "MGNT", "ПАО \"Магнит\" (о.а.)"))
        assets.put("ME", BaseAsset("ME", "MOEX", "ПАО Московская Биржа (о.а.)"))
        assets.put("MT", BaseAsset("MT", "MTSI", "ПАО \"МТС\" (о.а.)"))
        assets.put("NM", BaseAsset("NM", "NLMK", "ПАО \"НЛМК\" (о.а.)"))
        assets.put("NK", BaseAsset("NK", "NOTK", "ПАО \"НОВАТЭК\" (о.а.)"))
        assets.put("RN", BaseAsset("RN", "ROSN", "ПАО \"НК \"Роснефть\" (о.а.)"))
        assets.put("RT", BaseAsset("RT", "RTKM", "ПАО \"Ростелеком\" (о.а.)"))
        assets.put("SP", BaseAsset("SP", "SBPR", "ПАО Сбербанк (п.а.)"))
        assets.put("SR", BaseAsset("SR", "SBRF", "ПАО Сбербанк (о.а.)"))
        assets.put("SG", BaseAsset("SG", "SNGP", "ОАО \"Сургутнефтегаз\" (п.а.)"))
        assets.put("SN", BaseAsset("SN", "SNGR", "ОАО \"Сургутнефтегаз\" (о.а.)"))
        assets.put("TT", BaseAsset("TT", "TATN", "ПАО \"Татнефть\" им. В.Д. Шашина (о.а.)"))
        assets.put("TN", BaseAsset("TN", "TRNF", "ПАО \"Транснефть\" (п.а.)"))
        assets.put("VB", BaseAsset("VB", "VTBR", "Банк ВТБ (ПАО) (о.а.)"))
        assets.put("BW", BaseAsset("BW", "GBMW", "BMW AG (о.а.)"))
        assets.put("DM", BaseAsset("DM", "GDAI", "Daimler AG (о.а.)"))
        assets.put("DB", BaseAsset("DB", "GDBK", "Deutsche Bank AG (о.а.)"))
        assets.put("SM", BaseAsset("SM", "GSIE", "Siemens AG (о.а.)"))
        assets.put("VM", BaseAsset("VM", "GVW3", "Volkswagen AG (п.а.)"))
        //Процентные контракты
        assets.put("OX", BaseAsset("OX", "OF10", "\"десятилетние\" облигации федерального займа"))
        assets.put("OV", BaseAsset("OV", "OF15", "\"пятнадцатилетние\" облигации федерального займа"))
        assets.put("O2", BaseAsset("O2", "OFZ2", "\"двухлетние\" облигации федерального займа"))
        assets.put("O4", BaseAsset("O4", "OFZ4", "\"четырехлетние\" облигации федерального займа"))
        assets.put("O6", BaseAsset("O6", "OFZ6", "\"шестилетние\" облигации федерального займа"))
        assets.put("MP", BaseAsset("MP", "MOPR", "ставка MosPrime"))
        assets.put("RR", BaseAsset("RR", "RUON", "ставка RUONIA"))
        //Валютные контракты
        assets.put("AU", BaseAsset("AU", "AUDU", "курс австралийский доллар – доллар США"))
        assets.put("CY", BaseAsset("CY", "CY", "курс китайский юань – российский рубль"))
        assets.put("ED", BaseAsset("ED", "ED", "курс евро – доллар США"))
        assets.put("Eu", BaseAsset("Eu", "Eu", "курс евро – российский рубль"))
        assets.put("GU", BaseAsset("GU", "GBPU", "курс фунт стерлингов – доллар США"))
        assets.put("Si", BaseAsset("Si", "Si", "курс доллар США – российский рубль"))
        assets.put("CA", BaseAsset("CA", "UCAD", "курс доллар США – канадский доллар"))
        assets.put("CF", BaseAsset("CF", "UCHF", "курс доллар США – швейцарский франк"))
        assets.put("JP", BaseAsset("JP", "UJPY", "курс доллар США – японская йена"))
        assets.put("TR", BaseAsset("TR", "UTRY", "курс доллар США – турецкая лира"))
        assets.put("UU", BaseAsset("UU", "UUAH", "курс доллар США – украинская гривна"))
        //Товарные  контракты
        assets.put("BR", BaseAsset("BR", "BR", "нефть BRENT"))
        assets.put("CU", BaseAsset("CU", "CU", "медь"))
        assets.put("GD", BaseAsset("GD", "GOLD", "золото"))
        assets.put("PD", BaseAsset("PD", "PLD", "палладий"))
        assets.put("PT", BaseAsset("PT", "PLT", "платина"))
        assets.put("SV", BaseAsset("SV", "SILV", "серебро"))
        assets.put("SA", BaseAsset("SA", "SUGR", "сахар-сырец"))
    }
}