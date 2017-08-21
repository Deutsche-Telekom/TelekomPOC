create table sbl_price
(
  asset_version					number(19)		not null,
  price_id						varchar2(80)	not null,
  description					varchar2(1024)	null,
  price_list_currency_code		varchar2(255)	null,
  reference_price				number(19,7)	null,
  integration_id				varchar2(80)		null
,constraint sbl_price_p primary key (price_id,asset_version)
);

create table sbl_complex_price
(
  asset_version					number(19)		not null,
  complex_price_id				varchar2(80)	not null,
  name							varchar2(1024)	null,
  description					varchar2(1024)	null,
  start_date					timestamp		null,
  end_date						timestamp		null,
  exchange_date					timestamp		null,
  discount_method				varchar2(255)	null,
  currency_code					varchar2(255)	null
,constraint sbl_complex_price_p primary key (complex_price_id,asset_version)
);

create table sbl_price_level
(
  asset_version					number(19)		not null,
  price_level_id				varchar2(80)		not null,
  name							varchar2(1024)	null,
  description					varchar2(1024)	null,
  maximum_quantity				integer			null,
  adjustment_type  				varchar2(255)	null
,constraint sbl_price_level_p primary key (price_level_id,asset_version)
);