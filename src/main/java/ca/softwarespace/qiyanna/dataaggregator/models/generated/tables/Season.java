/*
 * This file is generated by jOOQ.
 */
package ca.softwarespace.qiyanna.dataaggregator.models.generated.tables;


import ca.softwarespace.qiyanna.dataaggregator.models.generated.Indexes;
import ca.softwarespace.qiyanna.dataaggregator.models.generated.Keys;
import ca.softwarespace.qiyanna.dataaggregator.models.generated.Qiyanna;
import ca.softwarespace.qiyanna.dataaggregator.models.generated.tables.records.SeasonRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Season extends TableImpl<SeasonRecord> {

    private static final long serialVersionUID = 1027789072;

    /**
     * The reference instance of <code>qiyanna.season</code>
     */
    public static final Season SEASON = new Season();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeasonRecord> getRecordType() {
        return SeasonRecord.class;
    }

    /**
     * The column <code>qiyanna.season.seasonid</code>.
     */
    public final TableField<SeasonRecord, Integer> SEASONID = createField("seasonid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>qiyanna.season.name</code>.
     */
    public final TableField<SeasonRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(55), this, "");

    /**
     * Create a <code>qiyanna.season</code> table reference
     */
    public Season() {
        this(DSL.name("season"), null);
    }

    /**
     * Create an aliased <code>qiyanna.season</code> table reference
     */
    public Season(String alias) {
        this(DSL.name(alias), SEASON);
    }

    /**
     * Create an aliased <code>qiyanna.season</code> table reference
     */
    public Season(Name alias) {
        this(alias, SEASON);
    }

    private Season(Name alias, Table<SeasonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Season(Name alias, Table<SeasonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Season(Table<O> child, ForeignKey<O, SeasonRecord> key) {
        super(child, key, SEASON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Qiyanna.QIYANNA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SEASON_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SeasonRecord> getPrimaryKey() {
        return Keys.SEASON_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SeasonRecord>> getKeys() {
        return Arrays.<UniqueKey<SeasonRecord>>asList(Keys.SEASON_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Season as(String alias) {
        return new Season(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Season as(Name alias) {
        return new Season(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Season rename(String name) {
        return new Season(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Season rename(Name name) {
        return new Season(name, null);
    }
}
