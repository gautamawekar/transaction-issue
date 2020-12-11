CREATE TABLE price_event (
  gtin INTEGER NOT NULL,
  advertise_date BIGINT NOT NULL,
  price_rule CLOB NOT NULL,
  is_published BOOLEAN NOT NULL,
  created_date BIGINT DEFAULT (strftime('%s', 'now')),
  evented_date BIGINT,
  PRIMARY KEY (gtin, advertise_date)
);