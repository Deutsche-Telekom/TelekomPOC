create table sbl_price
(
  asset_version					bigint			not null,
  price_id						varchar(80)		not null,
  description					nvarchar(1024)	null,
  price_list_currency_code		nvarchar(255)	null,
  reference_price				numeric(19,7)	null,
  integration_id				varchar(80)		null
,constraint sbl_price_p primary key (price_id,asset_version)
);

create table sbl_complex_price
(
  asset_version					bigint			not null,
  complex_price_id				varchar(80)		not null,
  name							nvarchar(1024)	null,
  description					nvarchar(1024)	null,
  start_date					timestamp		null,
  end_date						timestamp		null,
  exchange_date					timestamp		null,
  discount_method				nvarchar(255)	null,
  currency_code					nvarchar(255)	null
,constraint sbl_complex_price_p primary key (complex_price_id,asset_version)
);

create table sbl_price_level
(
  asset_version					bigint			not null,
  price_level_id				varchar(80)		not null,
  name							nvarchar(1024)	null,
  description					nvarchar(1024)	null,
  maximum_quantity				integer			null,
  adjustment_type  				nvarchar(255)	null
,constraint sbl_price_level_p primary key (price_level_id,asset_version)
);