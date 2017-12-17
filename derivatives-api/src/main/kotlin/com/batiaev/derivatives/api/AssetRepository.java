package com.batiaev.derivatives.api;

import com.batiaev.derivatives.api.model.BaseAsset;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * AssetRepository
 *
 * @author anton
 * @since 17/12/17
 */
@Component
public class AssetRepository {
    private Map<String, BaseAsset> assets = new HashMap<>();

    public AssetRepository() {
        //Индексные контракты
        assets.put("MX", new BaseAsset("MX", "MIX", "Индекс ММВБ"));
        assets.put("MM", new BaseAsset("MM", "MXI", "Индекс ММВБ (мини)"));
        assets.put("RI", new BaseAsset("RI", "RTS", "Индекс РТС"));
        assets.put("RS", new BaseAsset("RS", "RTSS", "Индекс голубых фишек"));
        assets.put("4B", new BaseAsset("4B", "ALSI", "Индекс FTSE/JSE Top40"));
        assets.put("VI", new BaseAsset("VI", "RVI", "Волатильность российского рынка"));
        //Фондовые контракты
        assets.put("AF", new BaseAsset("AF", "AFLT", "ПАО \"Аэрофлот\" (о.а.)"));
        assets.put("AL", new BaseAsset("AL", "ALRS", "АК \"АЛРОСА\" (ПАО) (о.а.)"));
        assets.put("CH", new BaseAsset("CH", "CHMF", "ПАО \"Северсталь\" (о.а.)"));
        assets.put("FS", new BaseAsset("FS", "FEES", "ПАО \"ФСК ЕЭС\" (о.а.)"));
        assets.put("GZ", new BaseAsset("GZ", "GAZR", "ПАО \"Газпром\" (о.а.)"));
        assets.put("GM", new BaseAsset("GM", "GMKR", "ПАО ГМК \"Норильский Никель\" (о.а.)"));
        assets.put("HY", new BaseAsset("HY", "HYDR", "ПАО \"РусГидро\" (о.а.)"));
        assets.put("LK", new BaseAsset("LK", "LKOH", "ПАО НК \"ЛУКОЙЛ\" (о.а.)"));
        assets.put("MN", new BaseAsset("MN", "MGNT", "ПАО \"Магнит\" (о.а.)"));
        assets.put("ME", new BaseAsset("ME", "MOEX", "ПАО Московская Биржа (о.а.)"));
        assets.put("MT", new BaseAsset("MT", "MTSI", "ПАО \"МТС\" (о.а.)"));
        assets.put("NM", new BaseAsset("NM", "NLMK", "ПАО \"НЛМК\" (о.а.)"));
        assets.put("NK", new BaseAsset("NK", "NOTK", "ПАО \"НОВАТЭК\" (о.а.)"));
        assets.put("RN", new BaseAsset("RN", "ROSN", "ПАО \"НК \"Роснефть\" (о.а.)"));
        assets.put("RT", new BaseAsset("RT", "RTKM", "ПАО \"Ростелеком\" (о.а.)"));
        assets.put("SP", new BaseAsset("SP", "SBPR", "ПАО Сбербанк (п.а.)"));
        assets.put("SR", new BaseAsset("SR", "SBRF", "ПАО Сбербанк (о.а.)"));
        assets.put("SG", new BaseAsset("SG", "SNGP", "ОАО \"Сургутнефтегаз\" (п.а.)"));
        assets.put("SN", new BaseAsset("SN", "SNGR", "ОАО \"Сургутнефтегаз\" (о.а.)"));
        assets.put("TT", new BaseAsset("TT", "TATN", "ПАО \"Татнефть\" им. В.Д. Шашина (о.а.)"));
        assets.put("TN", new BaseAsset("TN", "TRNF", "ПАО \"Транснефть\" (п.а.)"));
        assets.put("VB", new BaseAsset("VB", "VTBR", "Банк ВТБ (ПАО) (о.а.)"));
        assets.put("BW", new BaseAsset("BW", "GBMW", "BMW AG (о.а.)"));
        assets.put("DM", new BaseAsset("DM", "GDAI", "Daimler AG (о.а.)"));
        assets.put("DB", new BaseAsset("DB", "GDBK", "Deutsche Bank AG (о.а.)"));
        assets.put("SM", new BaseAsset("SM", "GSIE", "Siemens AG (о.а.)"));
        assets.put("VM", new BaseAsset("VM", "GVW3", "Volkswagen AG (п.а.)"));
        //Процентные контракты
        assets.put("OX", new BaseAsset("OX", "OF10", "\"десятилетние\" облигации федерального займа"));
        assets.put("OV", new BaseAsset("OV", "OF15", "\"пятнадцатилетние\" облигации федерального займа"));
        assets.put("O2", new BaseAsset("O2", "OFZ2", "\"двухлетние\" облигации федерального займа"));
        assets.put("O4", new BaseAsset("O4", "OFZ4", "\"четырехлетние\" облигации федерального займа"));
        assets.put("O6", new BaseAsset("O6", "OFZ6", "\"шестилетние\" облигации федерального займа"));
        assets.put("MP", new BaseAsset("MP", "MOPR", "ставка MosPrime"));
        assets.put("RR", new BaseAsset("RR", "RUON", "ставка RUONIA"));
        //Валютные контракты
        assets.put("AU", new BaseAsset("AU", "AUDU", "курс австралийский доллар – доллар США"));
        assets.put("CY", new BaseAsset("CY", "CY", "курс китайский юань – российский рубль"));
        assets.put("ED", new BaseAsset("ED", "ED", "курс евро – доллар США"));
        assets.put("Eu", new BaseAsset("Eu", "Eu", "курс евро – российский рубль"));
        assets.put("GU", new BaseAsset("GU", "GBPU", "курс фунт стерлингов – доллар США"));
        assets.put("Si", new BaseAsset("Si", "Si", "курс доллар США – российский рубль"));
        assets.put("CA", new BaseAsset("CA", "UCAD", "курс доллар США – канадский доллар"));
        assets.put("CF", new BaseAsset("CF", "UCHF", "курс доллар США – швейцарский франк"));
        assets.put("JP", new BaseAsset("JP", "UJPY", "курс доллар США – японская йена"));
        assets.put("TR", new BaseAsset("TR", "UTRY", "курс доллар США – турецкая лира"));
        assets.put("UU", new BaseAsset("UU", "UUAH", "курс доллар США – украинская гривна"));
        //Товарные  контракты
        assets.put("BR", new BaseAsset("BR", "BR", "нефть BRENT"));
        assets.put("CU", new BaseAsset("CU", "CU", "медь"));
        assets.put("GD", new BaseAsset("GD", "GOLD", "золото"));
        assets.put("PD", new BaseAsset("PD", "PLD", "палладий"));
        assets.put("PT", new BaseAsset("PT", "PLT", "платина"));
        assets.put("SV", new BaseAsset("SV", "SILV", "серебро"));
        assets.put("SA", new BaseAsset("SA", "SUGR", "сахар-сырец"));
    }

    public BaseAsset get(@NotNull String assetCode) {
        return assets.getOrDefault(assetCode, new BaseAsset(assetCode, null, null));
    }
}
